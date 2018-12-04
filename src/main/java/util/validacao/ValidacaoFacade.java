package util.validacao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 *
 * @author Lucas Dillmann
 */
public class ValidacaoFacade {

    private static final Validator validator;

    static {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public static class Resultado {

        private String mensagem;
        private boolean valoresInvalidos;

        public String getMensagem() {
            return mensagem;
        }
        public boolean isValoresInvalidos() {
            return valoresInvalidos;
        }

    }

    /**
     * Método de validação de um objeto com as anotações de sua classe
     *
     * @param objetos Objetos a serem validados
     * @return Resultado da verificação
     * @author Lucas Dillmann
     * @since 1.3.1
     */
    public static Resultado validar(Object... objetos) {

        Resultado resultado = new Resultado();
        resultado.valoresInvalidos = false;

        Set<ConstraintViolation<Object>> violacoes = new HashSet<>();

        for(Object objeto : objetos) {
            Set<ConstraintViolation<Object>> violacoesObjeto = getViolacoes(objeto);
            violacoes.addAll(violacoesObjeto);
        }

        if (!violacoes.isEmpty()) {
            resultado.valoresInvalidos = true;
            resultado.mensagem = "";

            Iterator<ConstraintViolation<Object>> iterator = violacoes.iterator();
            while (iterator.hasNext()) {
                ConstraintViolation<Object> violacao = iterator.next();
                String mensagem = violacao.getMessage().toLowerCase();
                String campo = violacao.getPropertyPath().toString();
                campo = campo.substring(0,1).toUpperCase() + campo.substring(1);
                resultado.mensagem +=
                        (resultado.mensagem.equals("") ? "" : "\n")
                                + "- " + campo + ": " + mensagem;
            }
        }

        return resultado;
    }

    private static <T> Set<ConstraintViolation<Object>> getViolacoes(T objeto) {
        return validator.validate(objeto);
    }
}

