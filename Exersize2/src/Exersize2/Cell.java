package Exersize2;

import java.util.Objects;

public class Cell {
int row;
int col;

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cell other = (Cell) obj;
	return col == other.col && row == other.row;
}
}
