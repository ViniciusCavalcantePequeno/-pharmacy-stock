class NameDoctorDisabledException extends RuntimeException{
    public NameDoctorDisabledException(String message){
        super("Nome de medico invalido");
    }
}