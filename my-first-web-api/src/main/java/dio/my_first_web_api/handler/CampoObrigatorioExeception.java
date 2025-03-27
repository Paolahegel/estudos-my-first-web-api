package dio.my_first_web_api.handler;

public class CampoObrigatorioExeception extends BusinessException{

    public CampoObrigatorioExeception(String message) {
        super("O campo %s é obrigatório");
    }
}
