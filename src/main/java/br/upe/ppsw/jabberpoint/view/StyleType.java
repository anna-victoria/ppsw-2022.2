package br.upe.ppsw.jabberpoint.view;

public enum StyleType {
    BULLET {
        @Override
        public String toString() {
            return "bullet";
        } //bullet no sentido dos pontinhos
    },
    NUMBER {
        @Override
        public String toString() {
            return "number";
        }
    },
    TITLE {
        @Override
        public String toString() {
            return "title";
        }
    },
    SUBTITLE {
        @Override
        public String toString() {
            return "subtitle";
        }
    },
    BODY {
        @Override
        public String toString() {
            return "body";
        }
    };

    public abstract String toString();
}
