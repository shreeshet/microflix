package com.simply.tp.microflix.persistence.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import com.vividsolutions.jts.geom.Point;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name="customer")
@NamedQuery(name="Inventory.findAll", query="SELECT i FROM Inventory i")
@SqlResultSetMapping(name="InventoryResults",
		classes = {
@ConstructorResult(
		targetClass = com.simply.tp.microflix.persistence.dto.InventoryDetails.class,
		columns = {
				@ColumnResult(name = "film_id",type = int.class),
				@ColumnResult(name = "rental_duration",type = byte.class),
				@ColumnResult(name = "inventory_id", type = int.class),
				@ColumnResult(name = "store_id", type = byte.class),
				@ColumnResult(name = "last_update", type = Timestamp.class),
				@ColumnResult(name = "location", type = Point.class)

		}
)
}
		)
public class Inventory implements Serializable {
	private static final long serialVersionUID = 1L;
	private int inventoryId;
	private Timestamp lastUpdate;
	private Film film;
	private Store store;
	private Set<Rental> rentals;

	public Inventory() {
	}


	@Id
	@Column(name="inventory_id", unique=true, nullable=false)
	public int getInventoryId() {
		return this.inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}


	@Column(name="last_update", nullable=false)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}


	//bi-directional many-to-one association to Film
	@ManyToOne
	@JoinColumn(name="film_id", nullable=false)
	public Film getFilm() {
		return this.film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}


	//bi-directional many-to-one association to Store
	@ManyToOne
	@JoinColumn(name="store_id", nullable=false)
	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}


	//bi-directional many-to-one association to Rental
	@OneToMany(mappedBy="customer")
	public Set<Rental> getRentals() {
		return this.rentals;
	}

	public void setRentals(Set<Rental> rentals) {
		this.rentals = rentals;
	}

	public Rental addRental(Rental rental) {
		getRentals().add(rental);
		rental.setInventory(this);

		return rental;
	}

	public Rental removeRental(Rental rental) {
		getRentals().remove(rental);
		rental.setInventory(null);

		return rental;
	}

}