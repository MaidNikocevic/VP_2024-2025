package mk.ukim.finki.wp.lab.web.controler;


import mk.ukim.finki.wp.lab.service.ArtistService;
import mk.ukim.finki.wp.lab.service.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/artists")
public class ArtistController {
    private final ArtistService artistService;
    private final SongService songService;

    public ArtistController(ArtistService artistService, SongService songService) {
        this.artistService = artistService;
        this.songService = songService;
    }

    @GetMapping("/list-artists")
    public String addToSong(@RequestParam Long trackId, Model model) {
        model.addAttribute("trackId", trackId);
        model.addAttribute("artists", artistService.listArtists());
        return "artistsList";
    }

    @PostMapping("/add-to-song")
    public String addToSong(@RequestParam Long artistId, Long trackId) {
        songService.addArtistToSong(artistId, trackId);
        return "redirect:/songs";
    }
}
