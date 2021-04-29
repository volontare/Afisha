package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

    @Test
    void ShouldShowDefaultAfisha() {

        MovieManager manager = new MovieManager();

        Movie first = new Movie(1, "Гнев человеческий", "боевик");
        Movie second = new Movie(2, "Зверокрекеры", "мультфильм");
        Movie third = new Movie(3, "Чернобыль ", "драма");
        Movie fourth = new Movie(4, "Майор Гром: Чумной доктор", "боевик");
        Movie fifth = new Movie(5, "Поколение Вояджер", "фантастика");
        Movie sixth = new Movie(6, "Нечестивые", "ужасы");
        Movie seventh = new Movie(7, "Великий", "драма");
        Movie eighth = new Movie(8, "100% Волк", "мультфильм");
        Movie ninth = new Movie(9, "Отец", "драма");
        Movie tenth = new Movie(10, "Любовь и монстры", "комедия");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Movie[] actual = manager.showMovies();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void ShouldShow10LastMovies() {

        MovieManager manager = new MovieManager();

        Movie first = new Movie(1, "Гнев человеческий", "боевик");
        Movie second = new Movie(2, "Зверокрекеры", "мультфильм");
        Movie third = new Movie(3, "Чернобыль ", "драма");
        Movie fourth = new Movie(4, "Майор Гром: Чумной доктор", "боевик");
        Movie fifth = new Movie(5, "Поколение Вояджер", "фантастика");
        Movie sixth = new Movie(6, "Нечестивые", "ужасы");
        Movie seventh = new Movie(7, "Великий", "драма");
        Movie eighth = new Movie(8, "100% Волк", "мультфильм");
        Movie ninth = new Movie(9, "Отец", "драма");
        Movie tenth = new Movie(10, "Любовь и монстры", "комедия");
        Movie eleventh = new Movie(11, "Гениальное ограбление", "триллер");
        Movie twelve = new Movie(12, "Мортал Комбат", "боевик");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        Movie[] actual = manager.showMovies();
        Movie[] expected = new Movie[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    void ShouldShowSelectedQuantityMovies() {

        MovieManager manager = new MovieManager(5);

        Movie first = new Movie(1, "Гнев человеческий", "боевик");
        Movie second = new Movie(2, "Зверокрекеры", "мультфильм");
        Movie third = new Movie(3, "Чернобыль ", "драма");
        Movie fourth = new Movie(4, "Майор Гром: Чумной доктор", "боевик");
        Movie fifth = new Movie(5, "Поколение Вояджер", "фантастика");
        Movie sixth = new Movie(6, "Нечестивые", "ужасы");
        Movie seventh = new Movie(7, "Великий", "драма");
        Movie eighth = new Movie(8, "100% Волк", "мультфильм");
        Movie ninth = new Movie(9, "Отец", "драма");
        Movie tenth = new Movie(10, "Любовь и монстры", "комедия");
        Movie eleventh = new Movie(11, "Гениальное ограбление", "триллер");
        Movie twelve = new Movie(12, "Мортал Комбат", "боевик");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        Movie[] actual = manager.showMovies();
        Movie[] expected = new Movie[]{twelve, eleventh, tenth, ninth,eighth};

        assertArrayEquals(expected, actual);
    }

    @Test
    void ShouldShowWhenMoviesUnder10() {
        MovieManager manager = new MovieManager();

        Movie first = new Movie(1, "Гнев человеческий", "боевик");
        Movie second = new Movie(2, "Зверокрекеры", "мультфильм");
        Movie third = new Movie(3, "Чернобыль ", "драма");
        Movie fourth = new Movie(4, "Майор Гром: Чумной доктор", "боевик");
        Movie fifth = new Movie(5, "Поколение Вояджер", "фантастика");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);


        Movie[] actual = manager.showMovies();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}

