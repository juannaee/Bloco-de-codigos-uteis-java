
/*Util para ler arquivos em formato csv,o objeto Employee é uma entidade.*/

try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2])));
				line = br.readLine();

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
