package co.edu.uco.pch.businnes.facade;

public interface FacadeWithReturn<T, K> {
	K execute(T dto);

}
