package com.ednaldo.Order;

import com.ednaldo.Order.entities.Order;
import com.ednaldo.Order.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	private final OrderService orderService;

    public OrderApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("XXXXX DADOS DO PEDIDO XXXXXX");
		System.out.print("Código: ");
		Integer code = sc.nextInt();
		System.out.print("Valor básico: ");
		double basic = sc.nextDouble();
		System.out.print("Valor do desconto: ");
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.printf("Pedido código: %d%n", order.getCode());
		System.out.printf("Valor total: %.2f%n", orderService.total(order) );

		sc.close();

	}
}
