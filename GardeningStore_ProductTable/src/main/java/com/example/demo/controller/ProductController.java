package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProdectService;
//import com.example.demo.model.Ordermodel;
import com.example.demo.model.Prodect;

@RestController
public class ProductController {
	@Autowired
	ProdectService sser;
	
	@PostMapping("adddet")
	public Prodect adddetails(@RequestBody Prodect ss)
	{
		return sser.saveinfo(ss);
	}
	@PostMapping("addprodectlist")
	public List<Prodect> addlist (@RequestBody List<Prodect> ss)
	{
		return sser.arrayProdectsaveinfo(ss);
	}

	@GetMapping("showt")
	public List<Prodect> showdetail()
	{
		return sser.showinfo();
	}
	@GetMapping("showid")
	public Optional<Prodect> showbyid(@RequestParam int id)
	{
		return sser.showninfo(id);
	}
	
	@PutMapping("updatet")
	public Prodect updatedetail(@RequestBody Prodect ss)
	{
		return sser.updateinfo(ss);
	}
	@PutMapping("updateid/{id}")
	public String updatenid(@PathVariable int id,@RequestBody Prodect ss)
	{
		return sser.updateinfobyid(id,ss);
	}
	@DeleteMapping("Deletet")
	public String deletedetails(@RequestBody Prodect ss)
	{
		sser.deleteinfo(ss);
		return "deleted succesfully";
	}
	@DeleteMapping("deleteid/{id}")
	public void deterByid(@PathVariable int id)
	{
		sser.deleteid(id);
		
	}
}
