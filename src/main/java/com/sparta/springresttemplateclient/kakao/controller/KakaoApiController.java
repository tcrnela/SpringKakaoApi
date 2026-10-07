package com.sparta.springresttemplateclient.kakao.controller;

import com.sparta.springresttemplateclient.kakao.dto.ItemDto;
import com.sparta.springresttemplateclient.kakao.service.KakaoApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class KakaoApiController {

    private final KakaoApiService kakaoApiService;

    public KakaoApiController(KakaoApiService naverApiService) {
        this.kakaoApiService = naverApiService;
    }

    @GetMapping("/search")
    public List<ItemDto> searchItems(@RequestParam String query)  {
        return kakaoApiService.searchItems(query);
    }
}