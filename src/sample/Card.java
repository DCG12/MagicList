package sample;

import org.json.JSONArray;

public class Card {
    private String name;
    private String type;
    private String rarity;
    private String text;
    private String power;
    private String PosterUrl;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
    public String getPosterUrl() {
        return PosterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        PosterUrl = posterUrl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", rarity='" + rarity + '\'' +
                ", text='" + text + '\'' +
                ", power='" + power + '\'' +
                ", PosterUrl='" + PosterUrl + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

