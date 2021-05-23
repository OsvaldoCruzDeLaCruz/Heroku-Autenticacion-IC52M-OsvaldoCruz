package osvaldo.cruz.org.service;

import java.util.List;

import osvaldo.cruz.org.model.Producto;

public interface IntProductoService {
	
	public List<Producto> obtenerTodos();
	public void guardar(Producto producto);
	public void elinimar(Integer idProducto);
	public Producto buscarPorId(Integer idProducto);
	

}
