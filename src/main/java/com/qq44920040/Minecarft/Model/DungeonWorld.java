package com.qq44920040.Minecarft.Model;

public class DungeonWorld {

    private String WorldName;
    private String WorldNum;
    private String WorldWatingTime;
    private String WorldLevel;
    private String aliasname;


    public void setWorldName(String worldName) {
        WorldName = worldName;
    }

    public void setWorldNum(String worldNum) {
        WorldNum = worldNum;
    }

    public void setWorldWatingTime(String worldWatingTime) {
        WorldWatingTime = worldWatingTime;
    }

    public void setWorldLevel(String worldLevel) {
        WorldLevel = worldLevel;
    }

    public String getAliasname() {
        return aliasname;
    }

    public void setAliasname(String aliasname) {
        this.aliasname = aliasname;
    }

    public DungeonWorld(String worldName, String worldNum, String worldWatingTime, String worldLevel, String aliasname) {
        WorldName = worldName;
        WorldNum = worldNum;
        WorldWatingTime = worldWatingTime;
        WorldLevel = worldLevel;
        this.aliasname = aliasname;
    }

    public String getWorldName() {
        return this.WorldName;
    }

    public String getWorldNum() {
        return this.WorldNum;
    }

    public String getWorldWatingTime() {
        return this.WorldWatingTime;
    }

    public String getWorldLevel() { return this.WorldLevel; }

}
