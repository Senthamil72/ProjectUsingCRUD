package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ProductRepo;
//import com.example.demo.model.Ordermodel;
import com.example.demo.model.Prodect;

@Service
public class ProdectService {

	@Autowired
	ProductRepo sr;
	public Prodect saveinfo(Prodect ss)
	{
		return sr.save(ss);
	}
	public List<Prodect> arrayProdectsaveinfo(List<Prodect> ss)
	{
		return sr.saveAll(ss);
	}
	public List<Prodect> showinfo()
	{
		return sr.findAll();
	}
	public Optional<Prodect> showninfo(int id)
	{
		return sr.findById(id);
	}
	
	public Prodect updateinfo(Prodect ss)
	{
		return sr.saveAndFlush(ss);
	}
	public String updateinfobyid(int id,Prodect ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid id";
		}
	}
	public void deleteinfo(Prodect ss)
	{
		sr.delete(ss);
	}
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
	
}
