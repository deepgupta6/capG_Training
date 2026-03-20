package com.music.streaming.platform.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.dto.Mapper;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.service.ArtistService;
import com.music.streaming.platform.service.impl.ArtistServiceImpl;

@RestController
@RequestMapping("music/platform/v1/artists")
public class ArtistController {
	private static ArtistService service;
	
	public ArtistController(ArtistService service) {
		this.service = service;
	}
	
	@PostMapping
	public Artist insertArtist(@RequestBody ArtistRequest ar) {
		return service.createArtist(ar);
	}
	
	@GetMapping
	public List<Artist> getAllArtist(){
		return service.getAllArtists();
	}
	
	@GetMapping("{aId}")
	public Artist getArtistById(@PathVariable Long aId){
		return service.getArtistById(aId);
	}
	
	@PutMapping("{aId}")
	public Artist updateArtist(@PathVariable Long aId,@RequestBody ArtistRequest ar){
		return service.updateArtist(aId, ar);
	}
	
	@DeleteMapping("{aId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateArtist(@PathVariable Long aId) {
		service.deleteArtist(aId);
	}
}
