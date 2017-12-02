package com.pmobrien.vultus.liftoff.services.pojo;

public class CalculatedScore {

  private String username;
  private Long snatch;
  private Long cleanAndJerk;
  private Long metcon;
  private Double score;

  public String getUsername() {
    return username;
  }

  public CalculatedScore setUsername(String username) {
    this.username = username;
    return this;
  }
  
  public Long getSnatch() {
    return snatch;
  }

  public CalculatedScore setSnatch(Long snatch) {
    this.snatch = snatch;
    return this;
  }

  public Long getCleanAndJerk() {
    return cleanAndJerk;
  }

  public CalculatedScore setCleanAndJerk(Long cleanAndJerk) {
    this.cleanAndJerk = cleanAndJerk;
    return this;
  }

  public Long getMetcon() {
    return metcon;
  }

  public CalculatedScore setMetcon(Long metcon) {
    this.metcon = metcon;
    return this;
  }

  public Double getScore() {
    return score;
  }

  public CalculatedScore setScore(Double score) {
    this.score = score;
    return this;
  }
}
