package br.com.alura.refl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Transformator {
    //o I declara que vamos ter como parametro uma classe
    //o O seria a saida
    public <I, O> O transform(I input) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //como nao sei qual o tipo da classe pode vir, é preciso informar um ?
        Class<?> source = input.getClass(); //pego as informacoes da classe

        //pego o nome da classe enviada para o metodo e acrescento o nome DTO
        //ex: Se for enviado a classe Pessoa, ficara PessoaDTO
        //caso tente pegar uma classe inexistente, sera lancada a excecao ClassNotFoundException
        Class<?> target = Class.forName(source.getName() + "DTO");

        //busca os construtores da classe e instancia com base nele
        //(O) estou falando que o retorno vai receber a instancia do construtor
        O targetClass = (O) target.getDeclaredConstructor().newInstance();

        Field[] sourceFields = source.getDeclaredFields();
        Field[] targetFields = target.getDeclaredFields();

        //comparando cada elemento de uma classe para a outra, caso sejam iguais, sera feita a conversao para DTO
        Arrays.stream(sourceFields).forEach(sourceField -> Arrays.stream(targetFields).forEach(targetField -> {
            validate(sourceField, targetField);
            try {
                targetField.set(targetClass, sourceField.get(input));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }));

        return targetClass;
    }

    private void validate(Field sourceField, Field targetField) {
        if (sourceField.getName().equals(sourceField.getName())
                && sourceField.getType().equals(targetField.getType())) {
            sourceField.setAccessible(true); //alterando os campos privados para serem acessados
            sourceField.setAccessible(true);
        }
    }
}