package com.music.streaming.platform.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.music.streaming.platform.dto.TrackRequest;
import com.music.streaming.platform.model.Track;
import com.music.streaming.platform.service.TrackService;

@RestController
@RequestMapping("/music/platform/v1/tracks")
public class TrackController {
	private final TrackService service;
	
	public TrackController(TrackService service) {
		this.service = service;
	}
	
	@PostMapping
	public Track createTrack(TrackRequest trackRequest) {
        return service.createTrack(trackRequest);
    }
	
	@GetMapping
	public List<Track> getAllTracks() {
        return service.getAllTracks();

    }
	
	@GetMapping("{trackId}")
    public Track getTrackById(@PathVariable Long trackId) {
        return service.getTrackById(trackId);
    }
	
	@PutMapping("{trackId}")
	public Track updateArtist(@PathVariable Long trackId,@RequestBody TrackRequest tr){
		return service.updateTrack(trackId, tr);
	}
	
	@DeleteMapping("{trackId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteTrack(@PathVariable Long trackId) {
       service.deleteTrack(trackId);;
    }
	
}
