package module_09;

public abstract class Abstract {
        public abstract int volume();
        public abstract int surfaceArea();

        public int getArea() {
            return volume();
        }
        public int getSurface_Area() {
            return surfaceArea();
        }
}
