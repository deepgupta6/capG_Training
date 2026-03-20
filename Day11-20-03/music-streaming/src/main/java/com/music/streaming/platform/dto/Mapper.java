package com.music.streaming.platform.dto;

import com.music.streaming.platform.model.Artist;

public class Mapper {

	public static ArtistRequest convertArtistToArtistRequest(Artist a) {
		return new ArtistRequest(a.getArtistName(), a.getBio(), a.getGenre(), a.getOrigin(), a.getFormedYear(),
				a.getSocialLink(), a.getImage());

	}

}
