package com.wecp.progressive.entity;

import java.sql.Date;

public class Match {
    private int first_team;
    private int second_team;
    private Date match_date;
    private String venue;
    private String result;
    private String status;
    private int winner_team_id;
    public Match(int first_team, int second_team, Date match_date, String venue, String result, String status,
            int winner_team_id) {
        this.first_team = first_team;
        this.second_team = second_team;
        this.match_date = match_date;
        this.venue = venue;
        this.result = result;
        this.status = status;
        this.winner_team_id = winner_team_id;
    }
    public int getFirst_team() {
        return first_team;
    }
    public void setFirst_team(int first_team) {
        this.first_team = first_team;
    }
    public int getSecond_team() {
        return second_team;
    }
    public void setSecond_team(int second_team) {
        this.second_team = second_team;
    }
    public Date getMatch_date() {
        return match_date;
    }
    public void setMatch_date(Date match_date) {
        this.match_date = match_date;
    }
    public String getVenue() {
        return venue;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getWinner_team_id() {
        return winner_team_id;
    }
    public void setWinner_team_id(int winner_team_id) {
        this.winner_team_id = winner_team_id;
    }


}