package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Movie;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)

class AfishaManagerTestWithMock {

    @Mock
    private AfishaRepository repository;

    @InjectMocks
    private AfishaManager manager = new AfishaManager(repository);

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
    void showDefaultAfisha() {
        Movie[] returned = new Movie[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        doReturn(returned).when(repository).findAll();

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{tenth,ninth,eighth,seventh,sixth,fifth,fourth,third,second,first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void showDefaultAfishaManyFilms() {
        Movie[] returned = new Movie[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelve};
        doReturn(returned).when(repository).findAll();

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{twelve,eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth,third};

        assertArrayEquals(expected, actual);
    }

    @Test
    void showDefaultAfishaFewMovies() {
        Movie[] returned = new Movie[]{first, second, fourth, fifth, sixth, seventh};
        doReturn(returned).when(repository).findAll();

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{seventh, sixth, fifth, fourth, second,first};

        assertArrayEquals(expected, actual);
    }
}