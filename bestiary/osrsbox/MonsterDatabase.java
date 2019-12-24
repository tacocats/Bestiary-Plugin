package net.runelite.client.plugins.bestiary.osrsbox;

import java.util.ArrayList;

public interface MonsterDatabase {
    public ArrayList<MonsterDefinition> searchMonsters(String monsterName);
}
