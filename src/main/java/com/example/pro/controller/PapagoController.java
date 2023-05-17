package com.example.pro.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pro.service.PapagoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
// @RestController json 형식데이터를 리턴하는방식(requestBody)
@Slf4j
@AllArgsConstructor
public class PapagoController {
	
	private PapagoService papagoService;
	
//		@GetMapping("/translate")
//		public Map<String, String> translate() {
//			Map<String, String> map = new HashMap<>();
//			map.put("name", "최재환");
//			map.put("age", "30");
//			log.info("map data =>{}", map);
//			return map;
//		}
		
		@GetMapping("/translate")
		public String goTranslate(@RequestParam Map<String, String> param, Model m) throws JsonMappingException, JsonProcessingException {
			m.addAttribute("translatedText", papagoService.translate(param));
			return "papago/translate";
		}
}