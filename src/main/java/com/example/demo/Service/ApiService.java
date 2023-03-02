package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepo;

@Service
public class ApiService {
	@Autowired
	BookRepo stRepo;
	public Book updateDetails(Book en) {
		return stRepo.saveAndFlush(en);
	}
	public String deleteDetails(int id) {
		stRepo.deleteById(id); 
	return "Deleted details";
	}
	public Book postDetails(Book e) {
		return stRepo.save(e);
	}
	public List<Book> getDetails(){
		return stRepo.findAll();
	}
	
}