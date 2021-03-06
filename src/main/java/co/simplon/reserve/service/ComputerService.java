package co.simplon.reserve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.reserve.model.Computer;
import co.simplon.reserve.repository.ComputerRepository;

@Service
public class ComputerService {

    @Autowired
    public ComputerRepository computerRepository;

    public List<Computer> getAll() {
	return computerRepository.findAll();
    }

    public List<Computer> getAllEnabled() {
	return computerRepository.getAllEnabled();
    }

    public void delete(Integer id) {
	computerRepository.delete(id);
    }

    public Computer add(Computer computer) {
	return computerRepository.save(computer);
    }

    public Computer getById(Integer id) {
	return computerRepository.findOne(id);
    }

}
