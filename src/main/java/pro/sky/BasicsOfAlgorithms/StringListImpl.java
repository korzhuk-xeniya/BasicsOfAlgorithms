package pro.sky.BasicsOfAlgorithms;

import java.util.Arrays;

public class StringListImpl implements StringList {
    private final String[] storage;
    private int size;

    public StringListImpl() {
        storage = new String[10];
    }
    public StringListImpl(int initSize) {
        storage = new String[initSize];
    }
        @Override
    public String add(String item) {
        return null;
    }

    @Override
    public String add(int index, String item) {
        return null;
    }

    @Override
    public String set(int index, String item) {
        return null;
    }

    @Override
    public String remove(String item) {
        return null;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            String s = storage[i];
            if (s.equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i > 0; i--) {
            String s = storage[i];
            if (s.equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (storage.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(storage, size);
    }
    public void validateItem(String item) {
        if (item == null) {
            throw new NullItemException();
        }
    }
    private void validateSize () {
        if (size == storage.length) {
            throw new StorageIsFullException();
        }
    }
    private void validateIndex (int index) {
        if (index < 0 || index >=size) {
            throw new InvalidIndexException();
        }
    }
}
