
/*Metodo para trazer o maior valor de uma lista.*/


public static <T extends Comparable<T>> T highestSalary(List<T> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("Lista vazia!");
		}

		
		T highestSalary = list.get(0);

		for (T item : list) {
			//se a comparação der 0 é igual.
			//Se der maior que zero significa que o item é maior que o highestSalary
			//Se der menor do que zero é o oposto menor que.....
			if (item.compareTo(highestSalary) > 0) {
				highestSalary = item;
			}
		}

		return highestSalary;
	}


/*Nesse exemplo to trazendo o maior salario, por isso para esse metodo fazer sentido tem que ter um arquivo com os dados,
uma classe funcionario com um metodo campereTo identificando qual parametro irei comparar : */

@Override
	public int compareTo(Employee o) {
		return getEmployeeSalary().compareTo(o.getEmployeeSalary());
	}
/* Com isso estou dizendo para comparar e o salario do funcionario. 
Na aplicação eu usei da seguinte forma: */
	Employee x = ProcesseReport.highestSalary(list);

/* To trazendo o metodo utlizando a lista criada na classe main como parametro*/ 
List<Employee> list = new ArrayList<>();

