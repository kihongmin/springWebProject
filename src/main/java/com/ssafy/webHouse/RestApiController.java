package com.ssafy.webHouse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.dto.Book;
import com.ssafy.service.BookService;

@CrossOrigin("*")
@RestController
public class RestApiController {
	private static final String SUCC="SUCCESS";
	private static final String FAIL="FAIL";

	@Autowired
	private BookService  bookSvc;

	@GetMapping(value="/book")
	public Map<String,Object> getAllbooks() {
		Map<String,Object> map=new HashMap<>();
		try {
			List<Book> books=bookSvc.search();
			map.put("status", SUCC);
			map.put("data",   books);
		}catch(Exception e) {
			map.put("status", FAIL);
			map.put("msg",    e.getMessage());
		}
		return map;
	}
	@GetMapping(value="/book/{isbn}")
	public Map<String, Object> getBook(@PathVariable String isbn){
		Map<String, Object> map=new HashMap<>();
		try{
			Book book=bookSvc.search(isbn);
			map.put("status", SUCC);
			map.put("data",   book);
		}catch(Exception e){
			map.put("status", FAIL);
			map.put("msg",    e.getLocalizedMessage());
		}
		return map;
	}
	@PostMapping("/book")
	public Map<String, Object> insertBook(@RequestBody Book book){ //Book 디폴트 생성자 필요
		Map<String, Object> map=new HashMap<>();
		try{
			bookSvc.add(book);
			map.put("status", SUCC);
			map.put("data",   bookSvc.search());
		}catch(Exception e){
			map.put("status", FAIL);
			map.put("msg",    e.getLocalizedMessage());
		}
		return map;
	}
	@PutMapping("/book/{isbn}")
	public Map<String, Object> updateBook(@RequestBody Book book, @PathVariable String isbn){
		Map<String, Object> map=new HashMap<>();
		try{
			bookSvc.update(book);
			map.put("status", SUCC);
			map.put("data",   bookSvc.search());
		}catch(Exception e) {
			map.put("status", FAIL);
			map.put("msg",    e.getLocalizedMessage());
		}
		return map;
	}
	@DeleteMapping("/book/{isbn}")
	public Map<String, Object> deleteBook(@PathVariable String isbn){
		Map<String, Object> map=new HashMap<>();
		try{
			bookSvc.delete(isbn);
			map.put("status", SUCC);
			map.put("data",   bookSvc.search());
		}catch(Exception e){
			map.put("status", FAIL);
			map.put("msg",    e.getLocalizedMessage());
		}
		return map;
	}
}
