package mk.ukim.finki.wp.lab_b.repository.inmemory;

import mk.ukim.finki.wp.lab_b.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab_b.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryArtistRepository {

    public List<Artist> findAll() {
        return DataHolder.artists;
    }

    public Optional<Artist> findById(Long id) {
        return DataHolder.artists.stream().filter(artist -> artist.getId().equals(id)).findFirst();
    }
}
