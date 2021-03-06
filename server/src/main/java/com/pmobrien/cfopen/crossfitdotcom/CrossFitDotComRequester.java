package com.pmobrien.cfopen.crossfitdotcom;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.pmobrien.cfopen.Application;
import com.pmobrien.cfopen.neo.pojo.Athlete;
import java.util.Collections;
import java.util.List;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class CrossFitDotComRequester {
  
  private static final String URL = "https://games.crossfit.com/competitions/api/v1/competitions/open/2018/leaderboards";
  private static final String AFFILIATE_ID = Application.getProperties().getData().getAffiliateId();
  
  private static final int MENS_DIVISION = 1;
  private static final int WOMENS_DIVISION = 2;
  
  public List<Athlete> getAllAthletes() {
    return Lists.newArrayList(Iterables.concat(getAthletes(MENS_DIVISION), getAthletes(WOMENS_DIVISION)));
  }
  
  public List<Athlete> getAthletes(int division) {
    try {
      return ClientBuilder.newClient()
          .target(URL)
          .queryParam("affiliate", AFFILIATE_ID)
          .queryParam("division", division)
          .request(MediaType.APPLICATION_JSON)
          .get(CrossFitDotComResponse.class)
          .toAthleteList();
    } catch(Exception ex) {
      ex.printStackTrace();
      
      return Collections.emptyList();
    }
  }
}
