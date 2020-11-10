package com.mejia.richard.zemoga;

import com.mejia.richard.zemoga.controller.PortafolioController;
import com.mejia.richard.zemoga.model.Portafolio;
import com.mejia.richard.zemoga.service.PortafolioService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
@RunWith(PowerMockRunner.class)
public class ZemogaTestApplicationTests {

	@Mock
	PortafolioService portafolioService;

	@Mock
	Portafolio portafolio;

	@InjectMocks
	PortafolioController portafolioController;

	@Test
	public void testInsertStudent(){
		portafolioController.add(portafolio);
		verify(portafolioService, times(1)).savePortafolio(portafolio);
	}
}
