package com.sparta.springresttemplateclient.kakao.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

@Getter
@NoArgsConstructor
public class ItemDto {
    private String title;
    private String url;
    private String thumbnail;
    private int price;

    public ItemDto(JSONObject itemJson) {
        this.title = itemJson.getString("title");
        this.url = itemJson.getString("url");
        this.thumbnail = itemJson.getString("thumbnail");
        this.price = itemJson.getInt("price");
    }
}
