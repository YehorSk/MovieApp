package com.example.movieapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.movieapp.model.Movie;
import com.example.movieapp.model.MovieRepository;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    // AndroidViewModel: used when viewModel class needs to access Android-specific components
    // ViewModel: suitable for non-Android-specific logic
    private MovieRepository repository;
    public MainViewModel(@NonNull Application application) {
        super(application);
        this.repository = new MovieRepository(application);
    }

    public LiveData<List<Movie>> getAllMovies(){
        return repository.getMutableLiveData();
    }



}
