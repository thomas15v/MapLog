package com.thomas15v.maplog.info;

import org.spongepowered.api.math.Vector2i;
import org.spongepowered.api.math.Vector3d;
import org.spongepowered.api.math.Vector3f;
import org.spongepowered.api.math.Vector3i;

import java.util.Objects;

/**
 * Created by thomas on 07/10/14.
 */

/**
 * Temporary Class to Define vectors
 */
public class Point implements Vector3i {

    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vector3i)
            return ((Vector3i) obj).getX() == getX() && ((Vector3i) obj).getZ() == getZ() && ((Vector3i) obj).getY() == getY();
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public Vector3i add(Vector3i v) {
        return null;
    }

    @Override
    public Vector3i add(double x, double y, double z) {
        return null;
    }

    @Override
    public Vector3i add(int x, int y, int z) {
        return null;
    }

    @Override
    public Vector3i sub(Vector3i v) {
        return null;
    }

    @Override
    public Vector3i sub(double x, double y, double z) {
        return null;
    }

    @Override
    public Vector3i sub(int x, int y, int z) {
        return null;
    }

    @Override
    public Vector3i mul(double a) {
        return null;
    }

    @Override
    public Vector3i mul(int a) {
        return null;
    }

    @Override
    public Vector3i mul(Vector3i v) {
        return null;
    }

    @Override
    public Vector3i mul(double x, double y, double z) {
        return null;
    }

    @Override
    public Vector3i mul(int x, int y, int z) {
        return null;
    }

    @Override
    public Vector3i div(double a) {
        return null;
    }

    @Override
    public Vector3i div(int a) {
        return null;
    }

    @Override
    public Vector3i div(Vector3i v) {
        return null;
    }

    @Override
    public Vector3i div(double x, double y, double z) {
        return null;
    }

    @Override
    public Vector3i div(int x, int y, int z) {
        return null;
    }

    @Override
    public int dot(Vector3i v) {
        return 0;
    }

    @Override
    public int dot(double x, double y, double z) {
        return 0;
    }

    @Override
    public int dot(int x, int y, int z) {
        return 0;
    }

    @Override
    public Vector3i cross(Vector3i v) {
        return null;
    }

    @Override
    public Vector3i cross(double x, double y, double z) {
        return null;
    }

    @Override
    public Vector3i cross(int x, int y, int z) {
        return null;
    }

    @Override
    public Vector3i pow(double pow) {
        return null;
    }

    @Override
    public Vector3i pow(int power) {
        return null;
    }

    @Override
    public Vector3i abs() {
        return null;
    }

    @Override
    public Vector3i negate() {
        return null;
    }

    @Override
    public Vector3i min(Vector3i v) {
        return null;
    }

    @Override
    public Vector3i min(double x, double y, double z) {
        return null;
    }

    @Override
    public Vector3i min(int x, int y, int z) {
        return null;
    }

    @Override
    public Vector3i max(Vector3i v) {
        return null;
    }

    @Override
    public Vector3i max(double x, double y, double z) {
        return null;
    }

    @Override
    public Vector3i max(int x, int y, int z) {
        return null;
    }

    @Override
    public int distanceSquared(Vector3i v) {
        return 0;
    }

    @Override
    public int distanceSquared(double x, double y, double z) {
        return 0;
    }

    @Override
    public int distanceSquared(int x, int y, int z) {
        return 0;
    }

    @Override
    public int distance(Vector3i v) {
        return 0;
    }

    @Override
    public int distance(double x, double y, double z) {
        return 0;
    }

    @Override
    public int distance(int x, int y, int z) {
        return 0;
    }

    @Override
    public int lengthSquared() {
        return 0;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public int getMinAxis() {
        return 0;
    }

    @Override
    public int getMaxAxis() {
        return 0;
    }

    @Override
    public Vector2i toVector2() {
        return null;
    }

    @Override
    public Vector2i toVector2(boolean useZ) {
        return null;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public Vector3f toFloat() {
        return null;
    }

    @Override
    public Vector3d toDouble() {
        return null;
    }

    @Override
    public int compareTo(Vector3i v) {
        return 0;
    }

    @Override
    public Vector3i clone() {
        return null;
    }
}
