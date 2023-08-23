package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.OrderRepo;
import com.example.demo.model.Ordermodel;



@Service
public class OrderService {
@Autowired
OrderRepo sr;
public Ordermodel saveinfo(Ordermodel ss)
{
	return sr.save(ss);
}
public List<Ordermodel> arraysaveinfo(List<Ordermodel> ss)
{
	return sr.saveAll(ss);
}
public List<Ordermodel> showinfo()
{
	return sr.findAll();
}
public Optional<Ordermodel> showninfo(int id)
{
	return sr.findById(id);
}
public Ordermodel updateinfo(Ordermodel ss)
{
	return sr.saveAndFlush(ss);
}
public String updateinfobyid(int id,Ordermodel ss)
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
public void deleteinfo(Ordermodel ss)
{
	sr.delete(ss);
}
public void deleteid(int id)
{
	sr.deleteById(id);
}

}
