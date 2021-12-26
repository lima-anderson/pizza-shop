package br.edu.ifpb.padroes.api.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PizzaDecoratorImp implements Pizza {
	private Pizza wrappe;

	public PizzaDecoratorImp(Pizza pizzaDecorator) {
		this.wrappe = pizzaDecorator;
	}

	@Override
	public Float getPrice() {
		return wrappe.getPrice();
	}

	@Override
	public String getName() {
		return wrappe.getName();
	}

}
