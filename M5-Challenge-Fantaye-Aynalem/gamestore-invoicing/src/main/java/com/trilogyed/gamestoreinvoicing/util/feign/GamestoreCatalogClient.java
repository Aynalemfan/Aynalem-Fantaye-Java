package com.trilogyed.gamestoreinvoicing.util.feign;

import com.trilogyed.gamestoreinvoicing.model.Game;
import com.trilogyed.gamestoreinvoicing.model.TShirt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Console;
import java.util.Optional;

@FeignClient(name = "gamestore-catalog")
public interface GamestoreCatalogClient {
    //Console
    @RequestMapping(value = "/console", method = RequestMethod.POST)
    public Optional<Console> createConsole(@PathVariable String console);
    @RequestMapping(value = "/console/{id}", method = RequestMethod.GET)
    public Optional<Console> getConsole(@PathVariable long id);

    @RequestMapping(value = "/consoles", method = RequestMethod.GET)
    public Optional<Console> getAllConsoles(@PathVariable String consoles);

    @RequestMapping(value = "/console/{id}", method = RequestMethod.PUT)
    public Optional<Console> updateConsole(@PathVariable Console id);

    @RequestMapping(value = "/console/{id}", method = RequestMethod.DELETE)
    public Optional<Console> deleteConsole(@PathVariable Console id);

    @RequestMapping(value = "/console/{manufacturer}", method = RequestMethod.GET)
    public Optional<Console> getConsoleByManufacturer(@PathVariable String manufacturer);

    //Game
    @RequestMapping(value = "/game", method = RequestMethod.POST)
    public Optional<Game> createGame(@RequestBody Game game);
    @RequestMapping(value = "/game/{id}", method = RequestMethod.GET)
    public Optional<Game> getGameById(long itemId);

    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public Optional<Game> getAllGames(@PathVariable String games);

    @RequestMapping(value = "/game/{id}", method = RequestMethod.PUT)
    public Optional<Game> updateGame(@PathVariable Game id);

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Optional<Game> deleteGame(@PathVariable Game id);

    @RequestMapping(value = "/game/studio/{studio}", method = RequestMethod.GET)
    public Optional<Game> getGameByStudio(@PathVariable Game studio);

    @RequestMapping(value = "/game/esrbrating/{esrb}", method = RequestMethod.GET)
    public Optional<Game> getGameByEsrbRating(@PathVariable String esrbRating);

    @RequestMapping(value = "/game/title/{title}", method = RequestMethod.GET)
    public Optional<Game> getGameByTitle(@PathVariable String title);

    //TShirt

    @RequestMapping(value = "/tShirt", method = RequestMethod.POST)
    public Optional<TShirt> createTShirt(@RequestBody TShirt tShirt);
    @RequestMapping(value = "/tShirt/{id}", method = RequestMethod.GET)
    public Optional<TShirt> getTShirtById(@PathVariable long id);

    @RequestMapping(value = "/tShirt", method = RequestMethod.GET)
    public Optional<TShirt> getAllTShirt(@PathVariable String tShirt);

    @RequestMapping(value = "/tShirt/{id}", method = RequestMethod.PUT)
    public Optional<TShirt> updateTShirt(@PathVariable TShirt id);

    @RequestMapping(value = "/tShirt/{id}", method = RequestMethod.DELETE)
    public Optional<TShirt> deleteTShirt(@PathVariable TShirt id);

    @RequestMapping(value = "/tShirt/size/{size}", method = RequestMethod.GET)
    public Optional<TShirt> getTShirtBySize(@PathVariable TShirt size);

    @RequestMapping(value = "/tShirt/color/{color}", method = RequestMethod.GET)
    public Optional<TShirt> getTShirtByColor(@PathVariable TShirt color);


}
