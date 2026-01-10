package POO.enums;

public enum Operacion {

    SUMAR{
        @Override
        public int aplicar(int a, int b) {
            return a + b;
        }
    },
    REST{
        @Override
        public int aplicar(int a, int b) {
            return a - b;
        }
    },
    MULTIPLICACION{
        @Override
        public int aplicar(int a, int b) {
            return a * b;
        }
    };

    public abstract int aplicar(int a,int b);
}
