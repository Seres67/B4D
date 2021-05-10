package fr.B4D.building.hdv;

import fr.B4D.utils.PointF;

import java.awt.*;
import java.util.List;

public class HDVItems extends HDV{

    public static HDVItems BONTA = new HDVItems(new Point(-30, -53), null, null, new PointF(0.5, 0.5));

    /**
     * Builder of the {@code HDV} class.
     *
     * @param position      - Position of the HDV on the map.
     * @param inPoints      - List of points to get into the building.
     * @param outPoints     - List of points to get out of the building.
     * @param tablePosition - Position of the table on the screen.
     */
    public HDVItems(Point position, List<PointF> inPoints, List<PointF> outPoints, PointF tablePosition) {
        super(position, inPoints, outPoints, tablePosition);
    }
}
