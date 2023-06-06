package com.endava.Ex48;

public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (root == null) {
            root = item;
            return true;
        }

        ListItem currentItem = root;

        while (currentItem != null) {
            int compareResult = currentItem.compareTo(item);
            if (compareResult == 0) {
                return false;
            } else if (compareResult < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                } else {
                    item.setNext(root);
                    root.setPrevious(item);
                    root = item;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("The item " + item.getValue() + " will be deleted.");
        }

        ListItem currentItem = root;
        while (currentItem != null) {
            int compareResult = currentItem.compareTo(item);
            if (compareResult == 0) {
                if (currentItem == root) {
                    root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (compareResult < 0) {
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            ListItem currentItem = root;
            while (currentItem != null) {
                System.out.println(currentItem.getValue());
                currentItem = currentItem.next();
            }
        }
    }
}
