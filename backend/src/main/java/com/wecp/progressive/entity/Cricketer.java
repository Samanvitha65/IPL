package com.wecp.progressive.entity;

public class Cricketer implements comparable<Cricketer> {
    private int cricketer_id;
    private int team_id;
    private int age;
    private String nationality;
    private int experience;
    private String role;
    private int total_runs;
    private int total_wickets;
    public Cricketer(int cricketer_id, int team_id, int age, String nationality, int experience, String role,
            int total_runs, int total_wickets) {
        this.cricketer_id = cricketer_id;
        this.team_id = team_id;
        this.age = age;
        this.nationality = nationality;
        this.experience = experience;
        this.role = role;
        this.total_runs = total_runs;
        this.total_wickets = total_wickets;
    }
    public int getCricketer_id() {
        return cricketer_id;
    }
    public void setCricketer_id(int cricketer_id) {
        this.cricketer_id = cricketer_id;
    }
    public int getTeam_id() {
        return team_id;
    }
    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getTotal_runs() {
        return total_runs;
    }
    public void setTotal_runs(int total_runs) {
        this.total_runs = total_runs;
    }
    public int getTotal_wickets() {
        return total_wickets;
    }
    public void setTatal_wickets(int total_wickets) {
        this.total_wickets = total_wickets;
    }

    public int compareTo(Cricketer c){
        return Integer.compare(this.getExperience(),c.getExperience());
    }
    

}