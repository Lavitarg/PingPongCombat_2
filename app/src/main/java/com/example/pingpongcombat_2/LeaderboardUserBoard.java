package com.example.pingpongcombat_2;

/**
 * Created by Марс on 22.08.2017.
 */

public class LeaderboardUserBoard {
    private String position;
    private String nickname;
    private String rating;

    public LeaderboardUserBoard() {
    }

    public LeaderboardUserBoard(String position, String nickname, String rating) {
        this.position = position;
        this.nickname = nickname;
        this.rating = rating;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
