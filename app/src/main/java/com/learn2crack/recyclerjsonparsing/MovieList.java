package com.learn2crack.recyclerjsonparsing;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieList {

    @SerializedName("name")
    private String name;
    @SerializedName("realname")
    private String realname;
    @SerializedName("team")
    private String team;

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }
}
