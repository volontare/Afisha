package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    int currentMoviesLength = 10;
    int newMoviesLength;

    public MovieManager(int newMoviesLength) {
        this.newMoviesLength = newMoviesLength;
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
        if (newMoviesLength > currentMoviesLength) {
            newMoviesLength = currentMoviesLength;
        }
//
        if (movies.length < newMoviesLength) {
            newMoviesLength = movies.length;
        }

        Movie[] result = new Movie[newMoviesLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
