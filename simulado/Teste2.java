package simulado;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Teste2 {
public static void main(String[] args) {
	ArrayList<String> strings = new ArrayList<String>();
	String valor = "Não ganhe o mundo e perca sua alma. sabedoria é melhor que prata e ouro.";
	strings.addAll(Arrays.asList(valor.split("(?<=\\G.{10})")));
	for (String str : strings) System.out.println("[" + str + "]\r\n");
}
}
