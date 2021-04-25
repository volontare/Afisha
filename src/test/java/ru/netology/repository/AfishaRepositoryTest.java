package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {
    AfishaRepository repository = new AfishaRepository();

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

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
        repository.save(eleventh);
        repository.save(twelve);
    }

    @Test
    void removeById() {
        repository.removeById(3);

        Movie[] actual = repository.findAll();
        Movie[] expected = new Movie[]{first, second, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelve};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeAll() {
        repository.removeAll();

        Movie[] actual = repository.findAll();
        Movie[] expected = new Movie[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    void findById() {
        Movie actual = repository.findById(3);
        Movie expected = third;

        assertEquals(expected, actual);
    }
}