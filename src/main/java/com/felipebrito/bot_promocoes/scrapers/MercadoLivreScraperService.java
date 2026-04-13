package com.felipebrito.bot_promocoes.scrapers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class MercadoLivreScraperService {
    private final RestTemplate restTemplate;

}
