package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;

@NoArgsConstructor

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int currentMoviesLength = 10;


    public MovieManager(int currentMoviesLength) {
        this.currentMoviesLength = currentMoviesLength;
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] showMovies() {
        int count = currentMoviesLength;
        if (movies.length < count) count = movies.length;
        Movie[] result = new Movie[count];
        for (int i = 0; i < count; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
