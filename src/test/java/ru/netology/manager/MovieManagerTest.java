package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {

    private MovieManager manager;
    private Movie first = new Movie(1, "Гнев человеческий", "боевик");
    private Movie second = new Movie(2, "Зверокрекеры", "мультфильм");
    private Movie third = new Movie(3, "Чернобыль ", "драма");
    private Movie fourth = new Movie(4, "Майор Гром: Чумной доктор", "боевик");
    private Movie fifth = new Movie(5, "Поколение Вояджер", "фантастика");
    private Movie sixth = new Movie(6, "Нечестивые", "ужасы");
    private Movie seventh = new Movie(7, "Великий", "драма");
    private Movie eighth = new Movie(8, "100% Волк", "мультфильм");
    private Movie ninth = new Movie(9, "Отец", "драма");
    private Movie tenth = new Movie(10, "Любовь и монстры", "комедия");
    private Movie eleventh = new Movie(11, "Гениальное ограбление", "триллер");
    private Movie twelve = new Movie(12, "Мортал Комбат", "боевик");

    @Test
    void ShouldShowDefaultAfisha() {

        manager = new MovieManager(10);

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
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second,first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void ShouldShow10LastMovies() {

        manager = new MovieManager(12);

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

        Movie[] expected = new Movie[]{twelve,eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, manager.showMovies());
    }
    @Test
    void ShouldShowOnly5LastMovies() {

        manager = new MovieManager(5);

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

        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth};

        assertArrayEquals(expected, manager.showMovies());
    }

    @Test
    void ShouldShowWhenMoviesUnder10() {
        manager = new MovieManager(5);

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

