package com.cse.project.controller;

import com.cse.project.entity.EventAttendeeId;
import com.cse.project.entity.EventSkillId;
import com.cse.project.entity.Skill;
import com.cse.project.entity.SkillCircleMemberId;
import com.cse.project.entity.SkillCircleSkillId;
import com.cse.project.entity.SkillRelationId;
import com.cse.project.entity.UserSkillOfferedId;
import com.cse.project.entity.UserSkillWantedId;

import java.lang.reflect.Field;

public final class ControllerIds {

    private ControllerIds() {
    }

    public static String stringId(String id) {
        return requireText(id, "id");
    }

    public static Skill skillId(String id) {
        Skill skill = new Skill();
        setField(skill, "id", requireText(id, "skillId"));
        return skill;
    }

    public static EventAttendeeId eventAttendeeId(String id) {
        String[] parts = split(id, "eventId,userId");
        EventAttendeeId value = new EventAttendeeId();
        setField(value, "event", parts[0]);
        setField(value, "user", parts[1]);
        return value;
    }

    public static EventSkillId eventSkillId(String id) {
        String[] parts = split(id, "eventId,skillId");
        EventSkillId value = new EventSkillId();
        setField(value, "event", parts[0]);
        setField(value, "skill", parts[1]);
        return value;
    }

    public static SkillCircleMemberId skillCircleMemberId(String id) {
        String[] parts = split(id, "circleId,userId");
        SkillCircleMemberId value = new SkillCircleMemberId();
        setField(value, "circle", parts[0]);
        setField(value, "user", parts[1]);
        return value;
    }

    public static SkillCircleSkillId skillCircleSkillId(String id) {
        String[] parts = split(id, "circleId,skillId");
        SkillCircleSkillId value = new SkillCircleSkillId();
        setField(value, "circle", parts[0]);
        setField(value, "skill", parts[1]);
        return value;
    }

    public static SkillRelationId skillRelationId(String id) {
        String[] parts = split(id, "skillId,relatedSkillId");
        SkillRelationId value = new SkillRelationId();
        setField(value, "skill", parts[0]);
        setField(value, "relatedSkill", parts[1]);
        return value;
    }

    public static UserSkillOfferedId userSkillOfferedId(String id) {
        String[] parts = split(id, "userId,skillId");
        UserSkillOfferedId value = new UserSkillOfferedId();
        setField(value, "user", parts[0]);
        setField(value, "skill", parts[1]);
        return value;
    }

    public static UserSkillWantedId userSkillWantedId(String id) {
        String[] parts = split(id, "userId,skillId");
        UserSkillWantedId value = new UserSkillWantedId();
        setField(value, "user", parts[0]);
        setField(value, "skill", parts[1]);
        return value;
    }

    private static String[] split(String id, String expectedFormat) {
        String[] parts = requireText(id, "id").split(",", -1);

        if (parts.length != 2 || parts[0].isBlank() || parts[1].isBlank()) {
            throw new IllegalArgumentException("ID must use format: " + expectedFormat);
        }

        return parts;
    }

    private static String requireText(String value, String name) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(name + " is required");
        }

        return value;
    }

    private static void setField(Object target, String fieldName, Object value) {
        try {
            Field field = target.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(target, value);
        } catch (ReflectiveOperationException exception) {
            throw new IllegalStateException("Could not set " + fieldName + " on " + target.getClass().getSimpleName(), exception);
        }
    }
}
