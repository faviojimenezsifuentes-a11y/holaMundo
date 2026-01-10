package POO.enums;

public enum HttpStatus {
    OK(200,"OK"),
    Created(201,"Created"),
    BAD_REQEST(400,"Bad Request"),
    NOT_FUND(404,"Not Found"),
    SERVER_ERROR(500,"Server Error"),
    ;

    private final int code;
    private final String descripcion;

    HttpStatus(int code, String descripcion) {
        this.code = code;
        this.descripcion = descripcion;
    }

    public int getCode() {
        return code;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static HttpStatus fromCode(int code){
        for (HttpStatus s : values()){
            if(s.code == code) return s;
        }
        return null;
    }
}
